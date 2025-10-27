def main():
    try:
        chicken_av, beef_av, pasta_av = map(int, input().split())
    except EOFError:
        return
    except ValueError:
        return

    try:
        chicken, beef, pasta = map(int, input().split())
    except EOFError:
        return
    except ValueError:
        try:
             return
        except:
             return
    total = 0
    
    if chicken_av < chicken:
        total += chicken - chicken_av

    if beef_av < beef:
        total += beef - beef_av

    if pasta_av < pasta:
        total += pasta - pasta_av

    print(total)

if __name__ == "__main__":
    main()
