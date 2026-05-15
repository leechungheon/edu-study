export function random() {
	const randomValue = Math.floor(Math.random() * 11)+3
	console.log(`randomValue=${randomValue} 초...`);
  return randomValue;
}