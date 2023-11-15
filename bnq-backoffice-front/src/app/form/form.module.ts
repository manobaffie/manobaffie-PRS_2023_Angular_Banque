import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { FormComponent } from './form/form.component';
import { FormInputTextComponent } from './form-input-text/form-input-text.component';
import { FormButtonComponent } from './form-button/form-button.component';
import { FormInputPasswordComponent } from './form-input-password/form-input-password.component';
import { FormLoginComponent } from './form-login/form-login.component';
import { FormRegisterComponent } from './form-register/form-register.component';

@NgModule({
  declarations: [
    FormComponent,
    FormInputTextComponent,
    FormInputPasswordComponent,
    FormButtonComponent,

    FormLoginComponent,
    FormRegisterComponent,
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  exports: [
    FormLoginComponent,
  ]
})
export class FormModule { }
