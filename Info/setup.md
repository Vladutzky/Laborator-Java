# Initial setup


## 1. JDK

You will need to set a Java Development Kit (JDK), in order to develop Java applications.

- download the open-source build of Java 21 from: https://www.oracle.com/java/technologies/downloads/#java21
- in `C:\Program Files`, create a new folder called `Java`
- extract the content of the build in this folder
- in System Variables, create a new variable called `JAVA_HOME`, pointing to the path of the build (i.e. `C:\Program Files\Java\open-jdk-21.0.2`)
- in System Variables, add to the `Path` variable the location of the bin folder (i.e.  `C:\Program Files\Java\open-jdk-21.0.2\bin`)

To test that everything works as expected, open a Terminal and execute `java -version`

## 2. Maven

This will be useful in the future, when you will want to use projects already developed, from a central repository

- download the latest version of Maven from: https://maven.apache.org/
- in `C:\Program Files`, create a new folder called `Maven`
- extract the content of the archive in this folder
- in System Variables, create a new variable called `MAVEN_HOME`, pointing to the path of the build (i.e. `C:\Program Files\Maven\maven-apache-3.9.6`)
- in System Variables, add to the `Path` variable the location of the bin folder (i.e. `C:\Program Files\Maven\maven-apache-3.9.6\bin`)

To test that everything works as expected, open a Terminal and execute `mvn -v`

## 3. Git

This will be useful in order to push your work to a repo and also to have easy access to the materials

- download and install the latest version of Git from: https://git-scm.com/downloads

To test that everything works as expected, open a Terminal and execute `git -v`

## 4. IntelliJ IDEA Ultimate

This will be the IDE in which we'll solve exercises from the lab.

- download and install the latest version of IntelliJ from: https://www.jetbrains.com/idea/download/
- in order to be able to use it, you will need to create an account on Jetbrains, then to confirm your student status here: https://www.jetbrains.com/shop/eform/students/. IMPORTANT: in this page, you need to use your student account (**@s.unibuc.ro**)

## 5. Docker

This will be used in the last part of the lab, when we will use databases, in order to have an easier management of it.

- download and install the latest version of Docker Desktop from: https://www.docker.com/products/docker-desktop/ (Docker Personal)

To test that everything works as expected, open a Terminal and execute `docker -v`

## 6. GitHub account

If you don't already have an account, you will need to create one here: https://github.com/.
In order push/commit your work during the lab, you'll need to create your own repository.

Go through the following steps:
### Step 1: Create a new repository
* Follow the steps under "Create a repository" from https://docs.github.com/en/repositories/creating-and-managing-repositories/quickstart-for-repositories
  * repository name e.g. "POO", "POO_II", etc.
  * set repo to be private
  * add a README file
  * under .gitignore select "Java"

### Step 2: Generate a SSH key
* Follow the steps from https://git-scm.com/book/ms/v2/Git-on-the-Server-Generating-Your-SSH-Public-Key

### Step 3: Add your newly generated key to GitHub
* Follow the steps from https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account

### Step 4: Clone your repository locally
* Follow the steps from https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository
  * make sure you change directory to your desired location before cloning

### Step 5: Manually Set SSH Key in Git Config
* Run in Terminal: git config --global core.sshCommand "ssh -i ~/.ssh/id_rsa" (or your given path/key name)

### Step 6: Open project in IntelliJ
  * start IntelliJ -> "File" -> "New project from Existing Sources" -> select project
  * name your project (e.g. "LabPOO") - don't add any lab number, we'll do this under directories

### Step 5: Setup JDK
  * start Intellij -> File -> Project Structure -> Project Settings - Project -> Select your pre-installed JDK 21

