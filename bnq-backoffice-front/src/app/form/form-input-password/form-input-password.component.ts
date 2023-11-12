import { Component, Input } from '@angular/core';
import { FormControl } from "@angular/forms";

@Component({
  selector: 'app-form-input-password',
  templateUrl: './form-input-password.component.html',
  styleUrls: ['./form-input-password.component.css']
})

export class FormInputPasswordComponent {
  formControl: FormControl;

  constructor() {
    this.formControl = new FormControl()
  }

}
