import { ChangeDetectorRef, Component } from '@angular/core';
import { UserService } from '../../services/user.service/user.service';
import { CommonModule, JsonPipe } from '@angular/common';

@Component({
  selector: 'app-user.component',
  imports: [JsonPipe, CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css',
})
export class UserComponent {

  users: any[] = [];

  constructor(private userService: UserService, private changeDetector: ChangeDetectorRef){

    this.userService.getUsers().subscribe(data =>{
        this.users = data;
        console.log(this.users);
        this.detectChange();
    })
  }

  detectChange(){
    this.changeDetector.detectChanges();
  }
}
