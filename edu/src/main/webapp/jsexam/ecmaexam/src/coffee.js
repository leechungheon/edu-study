import {random} from "./random.js"; 

//1. 요리 주문 함수 (Promise 생성)
export function orderCoffee(menu) {
  return new Promise((resolve, reject) => {
    console.log(`[주문] ${menu} 주문이 들어왔습니다.`);

    // 3초 뒤에 음식이 나온다고 가정
    setTimeout(() => {
      const isAvailable = true; // 재료가 있다고 가정

      if (isAvailable) {
        // 성공 시 resolve 호출
        resolve(`${menu}가 준비되었습니다! ☕`);
      } else {
        // 실패 시 reject 호출
        reject("죄송합니다. 재료가 소진되었습니다.");
      }
    }, random()*1000);
  });
}