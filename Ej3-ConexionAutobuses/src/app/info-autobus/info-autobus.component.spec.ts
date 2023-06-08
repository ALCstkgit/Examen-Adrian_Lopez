import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoAutobusComponent } from './info-autobus.component';

describe('InfoAutobusComponent', () => {
  let component: InfoAutobusComponent;
  let fixture: ComponentFixture<InfoAutobusComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InfoAutobusComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InfoAutobusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
