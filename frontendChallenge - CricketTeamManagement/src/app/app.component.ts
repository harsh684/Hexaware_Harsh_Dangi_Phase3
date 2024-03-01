import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Player } from './player.model';
import { PlayerServiceService } from './player-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';

  playerForm!:FormGroup;

  filteredList:Player[] = [];
  searchedRole:string='All';
  allPlayers:Player[]=[];

  player:Player={
    playerId: 0,
    playerName: '',
    jerseyNumber: 1,
    role: '',
    totalMatches: 0,
    teamName: '',
    countryName: '',
    description: ''
}

playerList:Player[]=[];

constructor(private playerService:PlayerServiceService,private formBuilder:FormBuilder){}

ngOnInit():void{
  this.playerService.getPlayers().subscribe(
    (response)=>{
      this.playerList=response;
      this.allPlayers=response;
    }
  );

  this.playerForm = this.formBuilder.group({
    playerName: ['', Validators.required],
    jerseyNumber: ['', Validators.required],
    role: ['', Validators.required],
    totalMatches: ['', Validators.required],
    teamName: ['', Validators.required],
    countryName: ['', Validators.required],
    description: ['', Validators.required]
  });
}

getByRole(){
  if(this.searchedRole !== 'All' || this.searchedRole.length !== 0){
    this.playerService.getByRole(this.searchedRole)
    .subscribe(
      (res)=>{
        this.filteredList = res;
        this.playerList=this.filteredList;
      },
      (err)=>{
        console.log(err);
        this.playerList = this.allPlayers;
      }
    )
  }
}

deletePlayer(playerId:number){
  this.playerService.deletePlayer(playerId).subscribe(
    (response)=>{
      alert(`player deleted`);
       window.location.reload();
    },
    (err)=>{
      alert(`player deleted`);
      window.location.reload();
    }
  )
}
}
