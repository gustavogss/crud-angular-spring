import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'category'
})
export class CategoryPipe implements PipeTransform {

  transform(value: string): string {
    switch(value){
      case 'front-end': return 'code';
      case 'back-end': return 'takeout_dining';
      case 'fullstack': return 'computer';
      case 'mobile': return 'phone_iphone';
      case 'cloud': return 'cloud';
    }
    return 'code';
  }

}
