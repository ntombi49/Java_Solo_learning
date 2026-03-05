import os

# Base folder (current working directory)
base_folder = os.getcwd()

# Java learning folder structure
folders = {
    "01_basics": [
        "HelloWorld.java",
        "Variables.java",
        "InputOutput.java",
        "Calculator.java"
    ],
    "02_conditions": [
        "IfStatements.java",
        "GradeCalculator.java",
        "EvenOddChecker.java"
    ],
    "03_loops": [
        "ForLoops.java",
        "WhileLoops.java",
        "MultiplicationTable.java"
    ],
    "04_data_structures": [
        "ArraysBasics.java",
        "HashMapBasics.java",
        "StudentScores.java"
    ],
    "05_methods": [
        "MethodsBasics.java",
        "WordCounter.java"
    ],
    "06_files_errors": [
        "FileHandling.java",
        "TryCatch.java",
        "RandomGame.java"
    ],
    "07_oop": [
        "Student.java",
        "BankAccount.java"
    ],
    "08_testing": [
        "Calculator.java",
        "TestCalculator.java"
    ],
    "09_projects": [
        "PasswordValidator.java",
        "CashRegister.java",
        "RomanNumeralConverter.java",
        "QuizGame.java"
    ]
}

# Create folders and files
for folder, files in folders.items():
    folder_path = os.path.join(base_folder, folder)
    os.makedirs(folder_path, exist_ok=True)
    
    for file in files:
        file_path = os.path.join(folder_path, file)
        
        if not os.path.exists(file_path):
            with open(file_path, "w") as f:
                f.write("// " + file.replace(".java", "").replace("_", " ").title() + "\n\n")
            print(f"Created: {file_path}")

# Create README file
readme_path = os.path.join(base_folder, "README.md")
if not os.path.exists(readme_path):
    with open(readme_path, "w") as f:
        f.write("# Java Solo Learning\n\nWelcome to your Java learning journey!\n")
    print(f"Created: {readme_path}")

print("\n✅ Java folder structure created successfully!")
