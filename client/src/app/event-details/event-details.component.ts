import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
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
    private http: HttpService
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
}