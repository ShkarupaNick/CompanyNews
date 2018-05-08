# _D&B-component-java_
> DnB integration component for the [elastic.io platform](http://www.elastic.io "elastic.io platform")

This is a component which can call **Company News D&B API** and returns news items for a given **D-U-N-S Number**.

## Before you Begin

Before you can use integration component **you should be a registered [developer.dnb.com](https://developer.dnb.com/register-v2) platform user**. Please see service [**documentation**](https://docs.dnb.com/direct/2.0/en-US/developer/credentials) to learn how use it.

> When registration will be completed, You will have your UserID, which DnB send to Your email and passphrase, which you will enter during registration process.

## Getting Started

####_Step 1_ 
![alt text](/src/main/resources/1.png)

After registration and uploading of your SSH Key you can proceed to deploy it into our system. At this stage we suggest you to:
* [Create a team](http://go2.elastic.io/manage-teams) to work on your new component. This is not required but will be automatically created using random naming by our system so we suggest you name your team accordingly.
* [Create a repository](http://go2.elastic.io/manage-repositories) where your new component is going to *reside* inside the team that you have just created.

```bash
$ git clone https://github.com/elasticio/petstore-component-java.git your-repository

$ cd your-repository
```
Now you can edit your version of **petstore-component-java** component and build your desired component. Or you can just ``PUSH``it into our system to see the process in action:

```bash
$ git remote add elasticio your-team@git.elastic.io:your-repository.git

$ git push elasticio master
```
Obviously the naming of your team and repository is entirely up-to you and if you do not put any corresponding naming our system will auto generate it for you but the naming might not entirely correspond to your project requirements.

## File Structure

The structure of **petstore-component-java** component is quite flexible. [elastic.io platform](https://www.elastic.io) expects only two files to be present in the main directory. These are the ``component.json`` and ``package.json``. Our documentation on [how to build a component in Java](http://go2.elastic.io/build-java-component) has more about each file and their function.