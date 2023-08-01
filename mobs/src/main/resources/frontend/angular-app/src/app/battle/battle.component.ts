import { Component } from '@angular/core';
import { BattleServiceService } from '../battle-service.service';


@Component({
  selector: 'app-battle',
  templateUrl: './battle.component.html',
  styleUrls: ['./battle.component.css']
})
export class BattleComponent {
  content?: string;
  constructor(private BattleServiceService: BattleServiceService)
  {

  }

  ngOnInit(): void{
      this.BattleServiceService.getServerMessage().subscribe({
        next:data => {this.content = data;}, error: err=> 
        {if(err.error){
          try{
            const res = JSON.parse(err.error);
            this.content = res.message;
          }
          catch{
            this.content = 'Error with status: ${err.status} - ${err.statusText}';
          }
        }
        else{
          this.content = 'Error with Status: ${err.status}';
        }
        
        }
      });
  }
}
