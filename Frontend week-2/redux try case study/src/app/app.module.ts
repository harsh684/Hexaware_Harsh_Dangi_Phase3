import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LanguageComponentComponent } from './components/language-component/language-component.component';
import { FormsModule } from '@angular/forms';
import { StoreModule } from '@ngrx/store';
import {HttpClientModule} from '@angular/common/http'
import { LanguagesReducer } from './store/reducer';

@NgModule({
  declarations: [
    AppComponent,
    LanguageComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    StoreModule.forRoot({languages: LanguagesReducer}),
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
