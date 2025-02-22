/*================================================================================
Copyright (c) 2013 Steve Jin. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25;

/**
 * @author Steve Jin (http://www.doublecloud.org)
 * @version 5.1
 */

@SuppressWarnings("all")
public class VirtualDeviceFileBackingInfo extends VirtualDeviceBackingInfo {
    public String fileName;
    public ManagedObjectReference datastore;
    public String backingObjectId;
    public String changeID;
    public String compatibilityMode;
    public String contentID;
    public String deltaDiskFormatVariant;
    public String deltaDiskFormat;
    public Integer deltaGrainSize;
    public String deviceName;
    public String diskMode;
    public String lunUuid;
    public VirtualDeviceFileBackingInfo parent;
    public String sharing;
    public String uuid;
    public Boolean writeThrough;
    public Boolean thinProvisioned;
    public Boolean split;
    public Boolean eagerlyScrub;
    public Boolean digestEnabled;


    public String getDeltaDiskFormatVariant() {
        return deltaDiskFormatVariant;
    }

    public Boolean getWriteThrough() {
        return writeThrough;
    }

    public Boolean getThinProvisioned() {
        return thinProvisioned;
    }

    public Boolean getSplit() {
        return split;
    }

    public Boolean getEagerlyScrub() {
        return eagerlyScrub;
    }

    public Boolean getDigestEnabled() {
        return digestEnabled;
    }

    public String getChangeID() {
        return this.changeID;
    }

    public String getCompatibilityMode() {
        return this.compatibilityMode;
    }

    public String getContentID() {
        return this.contentID;
    }

    public String getDeltaDiskFormat() {
        return this.deltaDiskFormat;
    }

    public Integer getDeltaGrainSize() {
        return this.deltaGrainSize;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDiskMode() {
        return this.diskMode;
    }

    public String getLunUuid() {
        return this.lunUuid;
    }

    public VirtualDeviceFileBackingInfo getParent() {
        return this.parent;
    }

    public String getSharing() {
        return this.sharing;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getFileName() {
        return this.fileName;
    }

    public ManagedObjectReference getDatastore() {
        return this.datastore;
    }

    public String getBackingObjectId() {
        return this.backingObjectId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDatastore(ManagedObjectReference datastore) {
        this.datastore = datastore;
    }

    public void setBackingObjectId(String backingObjectId) {
        this.backingObjectId = backingObjectId;
    }
}