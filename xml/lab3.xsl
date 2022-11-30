<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
  <body>
    <h2>NCC</h2>
    <table border="1">
      <tr bgcolor="#9acd32">
        <th>REGIMENTAL NUMBER</th>
        <th>NAME</th>
          <th>COLLEGE</th>
              <th>BATTALION</th>
                <th>WING</th>
                  <th>CERTIFICATE</th> 
      </tr>
      <xsl:for-each select="NCC/cadets">
     
        <tr>
          <td><xsl:value-of select="reg_no"/></td>
          <td><xsl:value-of select="name"/></td>
          <td><xsl:value-of select="collegename"/></td>
          <td><xsl:value-of select="bt_name"/></td>
          <td><xsl:value-of select="wing"/></td>
          <td><xsl:value-of select="certificates"/></td>
        </tr>
      </xsl:for-each>
    </table>
  </body>
  </html>
</xsl:template>

</xsl:stylesheet>