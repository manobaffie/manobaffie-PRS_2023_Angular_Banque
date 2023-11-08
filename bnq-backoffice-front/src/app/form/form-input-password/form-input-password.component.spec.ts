import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormInputPasswordComponent } from './form-input-password.component';

describe('FormInputPasswordComponent', () => {
  let component: FormInputPasswordComponent;
  let fixture: ComponentFixture<FormInputPasswordComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormInputPasswordComponent]
    });
    fixture = TestBed.createComponent(FormInputPasswordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
