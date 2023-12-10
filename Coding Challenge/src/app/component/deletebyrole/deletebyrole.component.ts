import { Component } from '@angular/core';
import { CricketserviceService } from 'src/app/service/cricketservice.service';

@Component({
  selector: 'app-deletebyrole',
  templateUrl: './deletebyrole.component.html',
  styleUrls: ['./deletebyrole.component.css']
})
export class DeletebyroleComponent {

  constructor(private service:CricketserviceService){

  }
nameToDelete: string = '';
teamToDelete: string = '';
  onSubmit() {
    
    console.log('Name to delete:', this.nameToDelete);

    this.service.delete(this.nameToDelete,this.teamToDelete).subscribe(() =>{
      console.log('Deleted successfully!');
    });
    this.nameToDelete = '';
    this.teamToDelete = '';
  }
}

