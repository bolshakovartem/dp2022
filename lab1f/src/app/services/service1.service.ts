import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Animal } from '../interfaces/animal';

@Injectable({
  providedIn: 'root'
})
export class Service1Service {
  url:string = "http://localhost:8080/lab1/Servlet1";
  constructor(private http:HttpClient) {}

  getAnimals():Observable<Animal[]>{
    return this.http.get<Animal[]>(this.url);
  }
}
