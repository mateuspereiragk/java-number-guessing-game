# Simple LMS Assignment Simulation

# Sample assignment data
assignment = {
    "title": "Essay 1",
    "due_date": "2026-04-10",
    "instructions": "Write a 500-word essay."
}

# Storage
submissions = {}
grades = {}

# Function to view assignment
def view_assignment(student):
    print("\n--- Assignment Details ---")
    print("Title:", assignment["title"])
    print("Due Date:", assignment["due_date"])
    print("Instructions:", assignment["instructions"])

# Function to submit assignment
def submit_assignment(student):
    file_name = input("Enter your file name to submit: ")
    submissions[student] = file_name
    print("Submission successful!")

# Function to grade assignment
def grade_assignment(student):
    if student in submissions:
        grade = input("Enter grade for " + student + ": ")
        feedback = input("Enter feedback: ")
        grades[student] = (grade, feedback)
        print("Grading complete!")
    else:
        print("No submission found.")

# Function to view results
def view_results(student):
    if student in grades:
        print("\n--- Results ---")
        print("Grade:", grades[student][0])
        print("Feedback:", grades[student][1])
    else:
        print("Assignment not graded yet.")

# Main program
student_name = input("Enter your name: ")

while True:
    print("\n1. View Assignment")
    print("2. Submit Assignment")
    print("3. View Results")
    print("4. Teacher: Grade Assignment")
    print("5. Exit")

    choice = input("Choose an option: ")

    if choice == "1":
        view_assignment(student_name)
    elif choice == "2":
        submit_assignment(student_name)
    elif choice == "3":
        view_results(student_name)
    elif choice == "4":
        grade_assignment(student_name)
    elif choice == "5":
        break
    else:
        print("Invalid choice")
