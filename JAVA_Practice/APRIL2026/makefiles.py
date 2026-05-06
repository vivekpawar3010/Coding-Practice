import os

# Loop from 20 to 30 (inclusive)
for i in range(20, 31):
    filename = f"APR_{i}_leetCode.java"
    
    # Open the file in write mode to create it
    with open(filename, 'w') as f:
        # Optionally, you can write a basic Java class template inside
        f.write(f"public class APR_{i}_leetCode {{\n    // Write your code here\n}}\n")

print("Files successfully created in the current directory!")