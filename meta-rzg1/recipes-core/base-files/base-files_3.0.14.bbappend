require meta-rzg1/include/multimedia-control.inc

do_install_append () {
    if [ "X${USE_MULTIMEDIA}" = "X1" ] ; then
        echo "export LD_LIBRARY_PATH=\"/usr/local/lib\"" >> ${D}${sysconfdir}/profile
    fi
}
