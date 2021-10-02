#!/bin/bash
if [ -d "/home/coder/project/workspace/springapp/" ]
then
    echo "project folder present"
    # checking for src folder
    if [ -d "/home/coder/project/workspace/springapp/src/" ]
    then
        cp -r /home/coder/project/workspace/junit/test /home/coder/project/workspace/springapp/src/;
		cd /home/coder/project/workspace/springapp/;
		mvn clean test;
    else
        echo "BE_Get_Trainers FAILED";
        echo "BE_Add_Trainer FAILED";
        echo "BE_Update_Trainer FAILED";
		echo "BE_Remove_Trainer FAILED";
    fi
else
	echo "BE_Get_Trainers FAILED";
	echo "BE_Add_Trainer FAILED";
	echo "BE_Update_Trainer FAILED";
	echo "BE_Remove_Trainer FAILED";
fi