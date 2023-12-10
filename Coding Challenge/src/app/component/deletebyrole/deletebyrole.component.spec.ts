import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletebyroleComponent } from './deletebyrole.component';

describe('DeletebyroleComponent', () => {
  let component: DeletebyroleComponent;
  let fixture: ComponentFixture<DeletebyroleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletebyroleComponent]
    });
    fixture = TestBed.createComponent(DeletebyroleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
