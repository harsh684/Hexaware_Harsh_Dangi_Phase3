import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { Languages } from 'src/app/models/Languages.model';
import { addLanguage, removeLanguage } from 'src/app/store/actions';

@Component({
  selector: 'app-language-component',
  templateUrl: './language-component.component.html',
  styleUrls: ['./language-component.component.css']
})
export class LanguageComponentComponent {
  newLanguageTitle!: string;

  languagesList!: Languages[];

  constructor(private store:Store<{languages:{allLanguages:Languages[]}}>) {

      store.select('languages').subscribe( (languagesState:{allLanguages:Languages[]})=>{

        this.languagesList = languagesState.allLanguages;

        console.log(this.languagesList);

      })

  }

  addLanguages(){

    if(this.newLanguageTitle.trim() === '') {


        return;
    
    }

     const language: Languages = {

      languageId:  Math.floor(Math.random() * (100 - 1 + 1)) + 1,
      languageName: this.newLanguageTitle
      
     }

     this.store.dispatch(addLanguage({language}));
     this.newLanguageTitle = '';

  }

  // toggleTodo(id:string){

  //     this.store.dispatch(toggleTodoAction({id}));

  // }
  
  removeTodo(languageId:number){
      this.store.dispatch(removeLanguage({languageId}));

  }


}

