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
