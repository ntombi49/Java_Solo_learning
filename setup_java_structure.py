import os

# Base folder (current directory)
base_folder = os.getcwd()

# Java learning structure
folders = {
    "src/basics": [
        "HelloWorld.java",
        "VariablesPractice.java",
        "InputOutputPractice.java",
        "DecisionPractice.java"
    ],
    "src/controlflow": [
        "IfElsePractice.java",
        "SwitchPractice.java",
        "LoopsPractice.java"
    ],
    "src/methods": [
        "MethodsBasics.java",
        "CalculatorMethods.java"
    ],
    "src/arrays": [
        "ArraysBasics.java",
        "StudentScores.java"
    ],
    "src/oop": [
        "Student.java",
        "BankAccount.java"
    ],
    "src/projects": [
        "QuizGame.java",
        "SimpleCalculator.java"
    ]
}

# Template for Java files
def create_java_template(class_name, package):
    return f"""package {package};

public class {class_name} {{
    public static void main(String[] args) {{

        // Your code starts here

    }}
}}
"""

# Create folders and files
for folder, files in folders.items():
    folder_path = os.path.join(base_folder, folder)
    os.makedirs(folder_path, exist_ok=True)

    package_name = folder.split("/")[-1]

    for file in files:
        file_path = os.path.join(folder_path, file)

        if not os.path.exists(file_path):
            class_name = file.replace(".java", "")
            with open(file_path, "w") as f:
                f.write(create_java_template(class_name, package_name))
            print(f"Created: {file_path}")

# Create README
readme_path = os.path.join(base_folder, "README.md")
if not os.path.exists(readme_path):
    with open(readme_path, "w") as f:
        f.write("# Java Solo Learning\n\nStructured Java learning project.\n")
    print(f"Created: {readme_path}")

print("\n✅ Java folder structure created successfully!")