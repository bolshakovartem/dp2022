import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Animal } from '../interfaces/animal';

@Injectable({
  providedIn: 'root'
})
export class Service1Service {
url:string = "http://localhost:3000/Animal";


  constructor(private http:HttpClient) { }

  getAnimals():Observable<Animal[]>{
    return this.http.get<Animal[]>(this.url);
  }
  postAnimals(animal:Animal):Observable<Animal[]>{
    return this.http.post<Animal[]>(this.url, animal);
  }
  putAnimals(animal:Animal):Observable<Animal[]>{
    return this.http.put<Animal[]>(this.url+"/"+animal.title, animal);
  }
  deleteAnimals(animal:Animal):Observable<Animal[]>{
    return this.http.delete<Animal[]>(this.url+"/"+animal.title);
  }

}
