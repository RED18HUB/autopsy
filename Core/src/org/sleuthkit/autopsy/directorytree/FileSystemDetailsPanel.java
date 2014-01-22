/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.directorytree;

import java.awt.event.ActionListener;

/**
 * This is the form / panel to show the File System Details.
 *
 * @author jantonius
 */
 class FileSystemDetailsPanel extends javax.swing.JPanel {

    /** Creates new form FileSystemDetailsPanel */
    FileSystemDetailsPanel() {
        initComponents();
    }

    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OKButton = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        genInfoPanel = new javax.swing.JPanel();
        fsTypeLabel = new javax.swing.JLabel();
        imgOffsetLabel = new javax.swing.JLabel();
        volumeIDLabel = new javax.swing.JLabel();
        blockSizeLabel = new javax.swing.JLabel();
        blockCountLabel = new javax.swing.JLabel();
        rootInumLabel = new javax.swing.JLabel();
        firstInumLabel = new javax.swing.JLabel();
        lastInumLabel = new javax.swing.JLabel();
        fsTypeValue = new javax.swing.JLabel();
        imgOffsetValue = new javax.swing.JLabel();
        volumeIDValue = new javax.swing.JLabel();
        blockSizeValue = new javax.swing.JLabel();
        blockCountValue = new javax.swing.JLabel();
        rootInumValue = new javax.swing.JLabel();
        firstInumValue = new javax.swing.JLabel();
        lastInumValue = new javax.swing.JLabel();
        genInfoLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        detailInfoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        OKButton.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.OKButton.text")); // NOI18N

        jSplitPane1.setDividerLocation(180);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        genInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        genInfoPanel.setPreferredSize(new java.awt.Dimension(815, 170));

        fsTypeLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.fsTypeLabel.text")); // NOI18N

        imgOffsetLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.imgOffsetLabel.text")); // NOI18N

        volumeIDLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.volumeIDLabel.text")); // NOI18N

        blockSizeLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.blockSizeLabel.text")); // NOI18N

        blockCountLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.blockCountLabel.text")); // NOI18N

        rootInumLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.rootInumLabel.text")); // NOI18N

        firstInumLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.firstInumLabel.text")); // NOI18N

        lastInumLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.lastInumLabel.text")); // NOI18N

        fsTypeValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.fsTypeValue.text")); // NOI18N

        imgOffsetValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.imgOffsetValue.text")); // NOI18N

        volumeIDValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.volumeIDValue.text")); // NOI18N

        blockSizeValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.blockSizeValue.text")); // NOI18N

        blockCountValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.blockCountValue.text")); // NOI18N

        rootInumValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.rootInumValue.text")); // NOI18N

        firstInumValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.firstInumValue.text")); // NOI18N

        lastInumValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.lastInumValue.text")); // NOI18N

        genInfoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        genInfoLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.genInfoLabel.text")); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.jLabel3.text")); // NOI18N

        javax.swing.GroupLayout genInfoPanelLayout = new javax.swing.GroupLayout(genInfoPanel);
        genInfoPanel.setLayout(genInfoPanelLayout);
        genInfoPanelLayout.setHorizontalGroup(
            genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genInfoPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fsTypeLabel)
                    .addComponent(imgOffsetLabel)
                    .addComponent(volumeIDLabel)
                    .addComponent(blockSizeLabel))
                .addGap(108, 108, 108)
                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genInfoLabel)
                    .addGroup(genInfoPanelLayout.createSequentialGroup()
                        .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blockSizeValue)
                            .addComponent(volumeIDValue)
                            .addComponent(imgOffsetValue)
                            .addComponent(fsTypeValue))
                        .addGap(31, 31, 31)
                        .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blockCountLabel)
                            .addComponent(rootInumLabel)
                            .addComponent(firstInumLabel)
                            .addComponent(lastInumLabel))
                        .addGap(111, 111, 111)
                        .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastInumValue)
                            .addComponent(firstInumValue)
                            .addComponent(rootInumValue)
                            .addComponent(blockCountValue))))
                .addGap(245, 245, 245))
        );
        genInfoPanelLayout.setVerticalGroup(
            genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(genInfoLabel)
                .addGap(18, 18, 18)
                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genInfoPanelLayout.createSequentialGroup()
                                .addComponent(fsTypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgOffsetLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(volumeIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(blockSizeLabel))
                            .addGroup(genInfoPanelLayout.createSequentialGroup()
                                .addComponent(fsTypeValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(imgOffsetValue)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(volumeIDValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(blockSizeValue)
                                    .addComponent(jLabel3))))
                        .addGroup(genInfoPanelLayout.createSequentialGroup()
                            .addComponent(blockCountValue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rootInumValue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(firstInumValue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lastInumValue))
                        .addGroup(genInfoPanelLayout.createSequentialGroup()
                            .addComponent(blockCountLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rootInumLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(firstInumLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lastInumLabel)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap())
        );

        jSplitPane1.setTopComponent(genInfoPanel);

        detailInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        detailInfoPanel.setPreferredSize(new java.awt.Dimension(516, 293));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout detailInfoPanelLayout = new javax.swing.GroupLayout(detailInfoPanel);
        detailInfoPanel.setLayout(detailInfoPanelLayout);
        detailInfoPanelLayout.setHorizontalGroup(
            detailInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailInfoPanelLayout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(276, 276, 276))
        );
        detailInfoPanelLayout.setVerticalGroup(
            detailInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailInfoPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(detailInfoPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OKButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sets the FileSystem type value on this panel.
     *
     * @param arg  the file system type
     */
    public void setFileSystemTypeValue(String arg) {
        fsTypeValue.setText(arg);
    }

    /**
     * Sets the image offset value on this panel.
     *
     * @param arg  the image offset
     */
    public void setImageOffsetValue(String arg) {
        imgOffsetValue.setText(arg);
    }

    /**
     * Sets the volume ID value on this panel.
     *
     * @param arg  the volume ID
     */
    public void setVolumeIDValue(String arg) {
        volumeIDValue.setText(arg);
    }

    /**
     * Sets the block size value on this panel.
     *
     * @param arg the block size value
     */
    public void setBlockSizeValue(String arg) {
        blockSizeValue.setText(arg);
    }

    /**
     * Sets the block count value on this panel.
     *
     * @param arg  the block count value
     */
    public void setBlockCountValue(String arg) {
        blockCountValue.setText(arg);
    }

    /**
     * Sets the root Inum value on this panel.
     *
     * @param arg  the root Inum value
     */
    public void setRootInumValue(String arg) {
        rootInumValue.setText(arg);
    }

    /**
     * Sets the first Inum value on this panel.
     *
     * @param arg  the first Inum value
     */
    public void setFirstInumValue(String arg) {
        firstInumValue.setText(arg);
    }

    /**
     * Sets the last Inum value on this panel.
     *
     * @param arg  the last Inum value
     */
    public void setLastInumValue(String arg) {
        lastInumValue.setText(arg);
    }

    /**
     * Sets the action listener on the OK button on this panel.
     *
     * @param e  the action listener
     */
    public void setOKButtonActionListener(ActionListener e) {
        OKButton.addActionListener(e);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel blockCountLabel;
    private javax.swing.JLabel blockCountValue;
    private javax.swing.JLabel blockSizeLabel;
    private javax.swing.JLabel blockSizeValue;
    private javax.swing.JPanel detailInfoPanel;
    private javax.swing.JLabel firstInumLabel;
    private javax.swing.JLabel firstInumValue;
    private javax.swing.JLabel fsTypeLabel;
    private javax.swing.JLabel fsTypeValue;
    private javax.swing.JLabel genInfoLabel;
    private javax.swing.JPanel genInfoPanel;
    private javax.swing.JLabel imgOffsetLabel;
    private javax.swing.JLabel imgOffsetValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lastInumLabel;
    private javax.swing.JLabel lastInumValue;
    private javax.swing.JLabel rootInumLabel;
    private javax.swing.JLabel rootInumValue;
    private javax.swing.JLabel volumeIDLabel;
    private javax.swing.JLabel volumeIDValue;
    // End of variables declaration//GEN-END:variables
}
