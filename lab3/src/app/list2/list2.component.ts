import { Component, OnInit } from '@angular/core';
import { IUser } from '../interfaces/user';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-list2',
  templateUrl: './list2.component.html',
  styleUrls: ['./list2.component.scss']
})
export class List2Component implements OnInit {

  usersList:IUser[]=[]

  constructor(private service:UserService) { }

  ngOnInit(): void {
    this.service.list.subscribe(
      (list:IUser[])=>{this.usersList=list}
    )
  }

}
