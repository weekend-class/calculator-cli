import sys
def main():
    arguments = sys.argv
    first_operator = arguments[2]
    a = int(arguments[1])
    b = int(arguments[3])
    if len(arguments) < 4 :
        print('make sure format: OPERAND OPERATOR OPERAND');
            
    elif len(arguments) < 5:
        
        if first_operator == '+':
            res = a + b
        elif first_operator == '-':
            res = a - b
        elif first_operator == '*' or arguments[0]:
            res = a * b
        elif first_operator == '/':
            res = a / b
        elif first_operator == '^':
            res = a ^ b
        elif first_operator == '%':
            res = a % b
        else:
            print("Invalid first_operator: '{}'".format(first_operator))
            exit()
    else:
        second_operator = arguments[4]
        c = int(arguments[5])
        if first_operator == '+' and  ( second_operator == '*' or second_operator == arguments[0] ) :
            res = a + b * c
        elif ( first_operator == '*' or second_operator == arguments[0] ) and second_operator == '/':
            res = a * b / c
        elif ( first_operator == '*' or second_operator == arguments[0] ) and second_operator == '+':
            res = a * b + c
        elif ( first_operator == '*' or second_operator == arguments[0] ) and second_operator == '-':
            res = a * b - c
        elif  first_operator == '-' and ( second_operator == '*' or second_operator == arguments[0] ) :
            res = a - b * c
        else:
            print("Operations not yet available : '{}' ".format(second_operator))
            exit()
    print(int(res))

main()