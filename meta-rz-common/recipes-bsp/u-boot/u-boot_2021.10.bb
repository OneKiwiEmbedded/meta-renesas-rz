require u-boot-common_${PV}.inc
require u-boot.inc

DEPENDS += "bc-native dtc-native"

#UBOOT_URL = "git://github.com/renesas-rz/renesas-u-boot-cip.git"
#BRANCH = "v2021.10/rz"
UBOOT_URL = "git://github.com/OneKiwiEmbedded/uboot-renesas-rz.git"
BRANCH = "onekiwi-v2021.10/rz"

SRC_URI = "${UBOOT_URL};branch=${BRANCH}"
#SRCREV = "fe9d08bec2006356760b70bb2f72ba2ba5aed5fd"
SRCREV = "7d47983d428c1442014d6bebaab7e87d12feeab9"
PV = "v2021.10+git${SRCPV}"
