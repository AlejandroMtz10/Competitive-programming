# Counter initialization
total_grenais = 0
inter_wins = 0

gremio_wins = 0
draws = 0

while True:
    # Read the goals scored by Inter and Gremio in the current match
    inter_goals, gremio_goals = map(int, input().split())
    total_grenais += 1
    
    # Determine the match result
    if inter_goals > gremio_goals:
        inter_wins += 1
    elif gremio_goals > inter_goals:
        gremio_wins += 1
    else:
        draws += 1
        
    # Ask if the user wants to register a new Grenal
    print("Novo grenal (1-sim 2-nao)")
    option = int(input())
    
    # If the option is 2, the loop breaks and stops reading
    if option == 2:
        break

# Display final results with the exact required format
print(f"{total_grenais} grenais")
print(f"Inter:{inter_wins}")
print(f"Gremio:{gremio_wins}")
print(f"Empates:{draws}")

# Determine which team won more matches overall
if inter_wins > gremio_wins:
    print("Inter venceu mais")
elif gremio_wins > inter_wins:
   print("Gremio venceu mais")
else:
    print("Nao houve vencedor")
