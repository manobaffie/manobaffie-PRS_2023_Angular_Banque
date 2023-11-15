import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu/menu.component';
import { MenuItemComponent } from './menu/menu-item/menu-item.component';
import { MenuDropdownComponent } from './menu/menu-dropdown/menu-dropdown.component';
import { PageLoginComponent } from './page/page-login/page-login.component';
import { PageHomeComponent } from './page/page-home/page-home.component';

import { FormModule } from './form/form.module';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    MenuItemComponent,
    MenuDropdownComponent,
    PageLoginComponent,
    PageHomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,

    FormModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
