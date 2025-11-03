import { Component, AfterViewInit, QueryList, ContentChildren } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

import { FormInputTextComponent } from '../form-input-text/form-input-text.component';
import { FormInputPasswordComponent } from '../form-input-password/form-input-password.component';


@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements AfterViewInit {
  @ContentChildren(FormInputTextComponent) private inputText?: QueryList<FormInputTextComponent>;
  @ContentChildren(FormInputPasswordComponent) private inputPassword?: QueryList<FormInputPasswordComponent>;
  // TODO modify QueryList<T> to array<QueryList<T>> or Map<T, QueryList<T>>

  formGroup: FormGroup

  constructor(
    private formBuilder: FormBuilder
  ) {
    this.formGroup = this.formBuilder.group({});
  }

  ngAfterViewInit(): void {
    this.inputText?.forEach((it, idx) => this.formGroup?.addControl(`text-${idx}`, it.formControl));
    this.inputPassword?.forEach((it, idx) => this.formGroup?.addControl(`password-${idx}`, it.formControl));
  }
}
