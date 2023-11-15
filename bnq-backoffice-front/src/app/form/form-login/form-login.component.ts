import { Component, AfterViewInit, ViewChild } from '@angular/core';

import { FormComponent } from '../form/form.component';

@Component({
  selector: 'app-form-login',
  templateUrl: './form-login.component.html',
  styleUrls: ['./form-login.component.css']
})
export class FormLoginComponent {
  @ViewChild(FormComponent) formContent?: FormComponent

  test(): void {
    console.log(this.formContent?.formGroup.controls["password-0"].value);
  }
}
