/*
 * Autopsy Forensic Browser
 *
 * Copyright 2019 Basis Technology Corp.
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
package org.sleuthkit.autopsy.filequery;

import com.google.common.eventbus.Subscribe;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.openide.util.Exceptions;
import org.sleuthkit.autopsy.filequery.FileSearchData.FileType;
import org.sleuthkit.datamodel.AbstractFile;

class GroupListPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;
    private LinkedHashMap<String, List<AbstractFile>> results = null;
    private FileType resultType = null;

    /**
     * Creates new form GroupListPanel
     */
    GroupListPanel() {
        initComponents();
    }

    @Subscribe
    void handleSearchCompleteEvent(DiscoveryEvents.SearchCompleteEvent searchCompleteEvent) {
        try {
            resultType = searchCompleteEvent.getFileType();
            results = searchCompleteEvent.getSearchResults().toLinkedHashMap();
            Set<String> resultsKeySet = results.keySet();
            groupList.setListData(resultsKeySet.toArray(new String[results.size()]));
            validate();
            repaint();
        } catch (FileSearchException ex) {
            Exceptions.printStackTrace(ex);
            groupList.setListData(new String[0]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupListScrollPane = new javax.swing.JScrollPane();
        groupList = new javax.swing.JList<>();

        groupList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                groupSelected(evt);
            }
        });
        groupListScrollPane.setViewportView(groupList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupListScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void groupSelected(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_groupSelected
        if (!evt.getValueIsAdjusting() && results != null) {
            DiscoveryEvents.getDiscoveryEventBus().post(new DiscoveryEvents.GroupSelectedEvent(resultType, results.get(groupList.getSelectedValue())));
        }
    }//GEN-LAST:event_groupSelected


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> groupList;
    private javax.swing.JScrollPane groupListScrollPane;
    // End of variables declaration//GEN-END:variables
}
