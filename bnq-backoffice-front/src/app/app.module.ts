import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu/menu.component';
import { MenuItemComponent } from './menu/menu-item/menu-item.component';
import { MenuDropdownComponent } from './menu/menu-dropdown/menu-dropdown.component';
import { PageLoginComponent } from './page/page-login/page-login.component';
import { PageHomeComponent } from './page/page-home/page-home.component';
import { FormInputTextComponent } from './form/form-input-text/form-input-text.component';
import { FormComponent } from './form/form/form.component';
import { FormButtonComponent } from './form/form-button/form-button.component';
import { FormInputPasswordComponent } from './form/form-input-password/form-input-password.component';
import { FormLoginComponent } from './form/form-login/form-login.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    MenuItemComponent,
    MenuDropdownComponent,
    PageLoginComponent,
    PageHomeComponent,
    FormInputTextComponent,
    FormComponent,
    FormButtonComponent,
    FormInputPasswordComponent,
    FormLoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
