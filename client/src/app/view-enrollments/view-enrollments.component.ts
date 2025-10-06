import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpService } from '../../services/http.service';

@Component({
  selector: 'app-view-enrollments',
  templateUrl: './view-enrollments.component.html',
})
export class ViewEnrollmentsComponent implements OnInit {
  enrollments: any[] = [];
  eventId!: number;
  errorMessage: string = '';
  loading = true;

  constructor(
    private http: HttpService,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.eventId = +this.route.snapshot.paramMap.get('eventId')!;
    this.fetchEnrollments();
  }

  fetchEnrollments(): void {
    this.http.getEnrollments(this.eventId).subscribe({
      next: (data) => {
        this.enrollments = data;
        this.loading = false;
      },
      error: (err) => {
        this.errorMessage = 'Failed to fetch enrollments.';
        this.loading = false;
      },
    });
  }
}