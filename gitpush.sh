#!/bin/bash

cd $1

git config --global user.email "srandolph6969@gmail.com"
git config --global user.name "Steven Randolph"
 
echo init the repository
git init .

echo add all files from root dir below, with ignore dirs and files in the .gitignore
git add .

echo 'commit all the files'
git commit -m "initial commit"

echo 'add a remote pseudo for the cim-energy-docker repository'

git remote add origin https://complexmathguy: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@github.com/complexmathguy/cim-energy-docker

echo 'push the commits to the repository master'
git push origin master


echo 'add tag next'
git tag next

echo 'push tag next'
git push origin next

