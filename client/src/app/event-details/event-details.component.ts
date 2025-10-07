import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthService } from '../../services/auth.service';
import { HttpService } from '../../services/http.service';

@Component({
  selector: 'app-event-details',
  templateUrl: './event-details.component.html',
  styleUrls: ['./event-details.component.css']
})
export class EventDetailsComponent implements OnInit {
  eventId!: number;
  eventData?: any;
  loading = true;

  constructor(
    private route: ActivatedRoute,
    private http: HttpService,
    private router: Router,
    public authService: AuthService
  ) {}

  ngOnInit(): void {
    this.eventId = Number(this.route.snapshot.paramMap.get('id'));
    this.fetchEventDetails();
  }

  fetchEventDetails(): void {
    this.http.getEventDetails(this.eventId).subscribe({
      next: (res) => {
        console.log(res);
        this.eventData = res;
        this.loading = false;
      },
      error: (err) => {
        console.error('Error fetching event details:', err);
        this.loading = false;
      }
    });
  }

  viewEnrollments() {
    this.router.navigateByUrl(`api/events/${this.eventId}/enrollments`)
  }
}