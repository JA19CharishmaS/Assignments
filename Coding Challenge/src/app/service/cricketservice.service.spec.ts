import { TestBed } from '@angular/core/testing';

import { CricketserviceService } from './cricketservice.service';

describe('CricketserviceService', () => {
  let service: CricketserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CricketserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
