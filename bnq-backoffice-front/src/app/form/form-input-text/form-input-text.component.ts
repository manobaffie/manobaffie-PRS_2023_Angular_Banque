import { Component } from '@angular/core';

import { FormControl } from "@angular/forms";

@Component({
  selector: 'app-form-input-text',
  templateUrl: './form-input-text.component.html',
  styleUrls: ['./form-input-text.component.css']
})
export class FormInputTextComponent {
  formControl: FormControl;

  constructor() {
    this.formControl = new FormControl()
  }
}
