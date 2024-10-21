import Text.Printf

main :: IO ()
main = do _ <- getLine :: IO String
          salario <- readLn :: IO Double
          ventas <- readLn :: IO Double
          printf "TOTAL = R$ %.2f\n" $ salario + 0.15 * ventas