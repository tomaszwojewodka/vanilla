import {Component, OnInit} from '@angular/core';
import {DashboardService} from './dashboard.service';

@Component({
    selector: 'ngx-dashboard',
    templateUrl: './dashboard.component.html',
})
export class DashboardComponent implements OnInit {
    message = 'DISABLED';

    constructor(private dashboardService: DashboardService) {
    }

    ngOnInit() {
        this.getMessage();
    }

    getMessage(): void {
        this.dashboardService.load().subscribe(message => this.message = message);
    }
}
