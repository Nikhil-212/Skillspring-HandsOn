CREATE OR REPLACE PACKAGE student_package AS
    PROCEDURE display_message(student_name VARCHAR2);
    FUNCTION is_passed(marks NUMBER) RETURN BOOLEAN;
END student_package;
/

CREATE OR REPLACE PACKAGE BODY student_package AS
    PROCEDURE display_message(student_name VARCHAR2) AS
    BEGIN
        DBMS_OUTPUT.PUT_LINE('Welcome ' || student_name);
    END;

    FUNCTION is_passed(marks NUMBER) RETURN BOOLEAN AS
    BEGIN
        RETURN marks >= 40;
    END;
END student_package;
/
