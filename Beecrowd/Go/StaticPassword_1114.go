package main

import (
	"fmt"
)

func main() {
	var password int

	// The cycle repeats as long as the password is not 2002
	for password != 2002 {
		// fmt.Scan reads integers directly from the console (like sc.nextInt())
		fmt.Scan(&password)

		if password != 2002 {
			fmt.Println("Senha Invalida")
		}
	}

	fmt.Println("Acesso Permitido")
}