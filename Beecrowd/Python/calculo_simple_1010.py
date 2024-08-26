def calculate_total_amount(product1_code, product1_units, product1_price, product2_code, product2_units, product2_price):
    total_amount = (product1_units * product1_price) + (product2_units * product2_price)
    return total_amount


def main():
    product1_code, product1_units, product1_price = map(float, input().split())
    product2_code, product2_units, product2_price = map(float, input().split())

    total_amount = calculate_total_amount(product1_code, product1_units, product1_price, product2_code, product2_units, product2_price)

    print(f"VALOR A PAGAR: R$ {total_amount:.2f}")


if __name__ == "__main__":
    main()