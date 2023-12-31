import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule}  from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductlistComponent } from './components/productlist/productlist.component';
import { AddproductComponent } from './components/addproduct/addproduct.component';

import {FormsModule}  from '@angular/forms'
import { ProductlistService } from './services/productlist.service';


@NgModule({
  declarations: [
    AppComponent,
    ProductlistComponent,
    AddproductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ProductlistService],
  bootstrap: [AppComponent]
})
export class AppModule { }
