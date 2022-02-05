import { Component } from '@angular/core';
import { Animal } from './interfaces/animal';
import { Service1Service } from './services/service1.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'lab1f';

  animalList:Animal[]=[];
  constructor(private service:Service1Service){}
  getAnimals():void{
    this.service.getAnimals().subscribe(
      (animals)=>{
        this.animalList=animals;
      }
    )
  }
}
