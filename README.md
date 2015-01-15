APCSProject
===========

##APCS first term final project

####Premise of project:
 A name generator (can be used for picking baby names) based on criteria such as:
 
    - gender (primarily male, primarily female, or can be both)
    - how masculine/feminine it is
    - how modern/old-fashioned it is
    - whether it appears in the Bible(Old and New Testaments)/Torah/Quran or not
    - popularity
    - country of origin
    - how normal the name is (different from popularity--this is like how unusual the name is)
    - more things probably 

  We will use Processing or GUI to create a window where the user can enter their preferences (drop-down list for country of origin, radio buttons/checkboxes for Bible/etc, sliding scale or radio buttons for 1-10 of things like popularity, etc). The user will click "Submit" and a list of the top 5 names will come up that match their criteria. The names (and their values for each input) will be stored in a csv file. 

  We might also add an option for the user to input their own names (and the values for each input) to the csv file (this way they can add their own name, etc).
  
####CHRONOLOGICAL LIST OF UPDATES
######1/5/15
  - edited README to include the premise and specifics of the project
  - started Chronological List of Updates
  
###### 1/6/15
  - created basic GUI window opener thing (GUI.java, first commit)

###### 1/7/15
  - Mapped out the project GUI on paper
  - started csv's of names
  - added value for "unusualness" of a name
 
###### 1/8/15
  - Worked on the GUI:
    - created intro window, made buttons to bring you to the 2 options
    - made basic windows for Entering a name and Generating a name
  - so far, we have the very basic GUI stuff, and preliminary data in the csv files. We're going to add all our criteria to the csv's, finish all the GUI stuff, and learn how to get data from and add data to the csv's
  

###### 1/9/15
- updated GUIs:
  - turned our previous labels into uneditable textareas
  - added stuff to EnterName GUI to input criteria along with the name (male/female, unusualness, etc)
- added txt file of names in the Bible so we can see if name is in there

###### 1/12/15
- Aaron exhibited mastery of GUI-foo
- A.K.A. we fixed all the stuff with the radio buttons in the EnterName GUI
- started the code to get values from the user inputs and match them to a name in the csv (GetName.java) <-- (later on we basically put all this in the GenerateName code so it is kind of pointless but we'll keep it around for now just in case)
- created a Person class that contains an ArrayList of Objects that we will store our values in. We'll use this to compare what the user wants in a name to the actual values contained in the csv files.
- IN GenerateName.java:
  - we added all the buttons and such
  - added buttonVal() method to get the chosen text from a ButtonGroup
  - updated actionPerformed to create a new Person with the requested values when "Give me a name!" button is pressed (NOTE: this doesn't work quite yet)
  - reorganized some things so that they're private variables instead of local ones so we can use them later

###### 1/13/15
- added value for "old-fashioned-ness" to boys.csv
- cleaned up EnterNewName by making different JComponents private variables instead of local, added buttonVal() code, started rudimentary creation of a Person given the user inputs
- it looks like we weren't super productive today but we really were I promise!!

###### 1/14/15
- continued adding values to the CSV's
- created Finished.java, which is the window that pops up when you click the Submit buttons in EnterNewName and GenerateName and asks you what you want to do next
- wrote methods that collect the user-inputted data and adds it to the correct csv for EnterNewName <--not positive if this works yet so will be testing shortly
- UPDATE: IT WORKS PRAISE THE LORD GLORY HALLELUJAH
- added Old-Fashioned buttons, method to collect the user inputs, and rudimentary calaculation method to GenerateName
 

####THINGS WE HAVE YET TO DO/FIX:
- input all the values for the csv's of names
- write the code to add a name and its values to the csv (EnterName.java)
  - we have code to put the values into a Person but we need to add the Person to the csv <--*THIS IS DONE MUAHAHAAHAA*
- add method to tell you if the name you want to enter is already in the system 
- finish writing the code to find the perfect match based on what you want (devise a mathematical somethin!)
  - to do this we need:
    - a way to run through the csv
    - a way to calculate compatability for each name
    - a way to store and return the top three highest matches and some of their information
- finish all the GUI stuff:
  - add all the radio buttons/drop-down menus/etc to EnterName and GenerateName for each value we want to compute
  - make it look pretty
- find the names of our future children that we are having together
