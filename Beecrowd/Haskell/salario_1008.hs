import Text.Printf

main :: IO ()
main = do noEmpleado <- readLn :: IO Int
          horas <- readLn :: IO Double
          monto <- readLn :: IO Double
          printf "NUMBER = %d\n" noEmpleado
          printf "SALARY = U$ %.2f\n" $ horas * monto
