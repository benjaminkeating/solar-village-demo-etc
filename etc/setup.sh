#!/bin/bash

cp /home/jboss/lab/*.sh /home/jboss/Desktop
yum install -y tree
rpm -Uvh http://dl.fedoraproject.org/pub/epel/beta/7/x86_64/epel-release-7-0.2.noarch.rpm
yum -y install dkms kernel-devel-$(uname -r) kernel-headers-$(uname -r)
wget http://download.virtualbox.org/virtualbox/4.3.14/VBoxGuestAdditions_4.3.14.iso
mount -o loop VBoxGuestAdditions_4.3.14.iso /media/
/media/VBoxLinuxAdditions.run
