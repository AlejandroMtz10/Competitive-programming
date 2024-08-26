/*
Problem: ¿Cuánto locro?
Number: 2936
Author: Alejandro Martínez Rivera.
Date: August/25th/2024
*/

using System;

class URI{
    static void Main(string[] args)
    {
        int[] vet = { 300, 1500, 600, 1000, 150 };
        int n, ans = 0;

        for (int i = 0; i < 5; i++)
        {
            n = int.Parse(Console.ReadLine());
            ans += n * vet[i];
        }

        ans += 225;

        Console.WriteLine(ans);
    }
}
