import { Component, ViewChild } from '@angular/core';
import { FormComponent } from '../form/form.component';
import { UserService } from 'src/app/service/user/user.service';

@Component({
  selector: 'app-form-register',
  templateUrl: './form-register.component.html',
  styleUrls: ['./form-register.component.css']
})
export class FormRegisterComponent {
  @ViewChild(FormComponent) formContent?: FormComponent

  constructor(
    private userService: UserService
  ) { }

  register(): void {

  }
}
